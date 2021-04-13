package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BombWrangler_56107 : Card() {
    override val id = 56107
    override val name = "炸弹牛仔"
    override val description = "每当该随从受到伤害，召唤一个1/1的砰砰机器人。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "炸弹牛仔希望自己的职业生涯能比引线还短。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a3340aab1b2f19c8c054fe3061fa27e08a0e3e11275e43caee1ea3fdd0cecb2.png"
}
