package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CursedDisciple_45594 : Card() {
    override val id = 45594
    override val name = "被诅咒的门徒"
    override val description = "<b>亡语：</b>召唤一个5/1的亡魂。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "比他的兄弟“诅咒人的门徒”更懂礼貌，但也更加邪恶。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7901149aef6343d3f128ff404d140d0133747e969600c549116b781b2d1dc4db.png"
}
