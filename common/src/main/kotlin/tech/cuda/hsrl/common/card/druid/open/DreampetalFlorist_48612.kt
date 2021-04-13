package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreampetalFlorist_48612 : Card() {
    override val id = 48612
    override val name = "梦境花栽种师"
    override val description = "在你的回合结束时，随机使你手牌中一张随从牌的法力值消耗减少（7）点。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "这些梦境花往往长得比栽种师还高。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78179c48b80f59f98ea3743e7745a1ba1db4a92a6e84eed88aa7e3c75d1f383f.png"
}
