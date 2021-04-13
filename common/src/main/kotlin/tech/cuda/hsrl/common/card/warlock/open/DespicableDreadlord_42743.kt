package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DespicableDreadlord_42743 : Card() {
    override val id = 42743
    override val name = "卑鄙的恐惧魔王"
    override val description = "在你的回合结束时，对所有敌方随从造成1点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "他领养了三位孤儿，还有一群唯命是从的小跟班。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7078d32cffb0f70e217aa697ce9f7547a5600239decc87de7ff62b302262a0ba.png"
}
