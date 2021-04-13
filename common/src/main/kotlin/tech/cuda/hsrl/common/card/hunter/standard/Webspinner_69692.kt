package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Webspinner_69692 : Card() {
    override val id = 69692
    override val name = "结网蛛"
    override val description = "<b>亡语：</b>随机将一张野兽牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "蜘蛛的茧里往往会藏着意想不到的好东西！"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/abfcf5d9edc5fd40e825ca82331d1be3ba479f50b1b599cd0aec6ccaa9f0da25.png"
}
