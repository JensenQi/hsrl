package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlamewreathedFaceless_38263 : Card() {
    override val id = 38263
    override val name = "投火无面者"
    override val description = "<b>过载：</b>（2）"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "他的手感热得发烫，百步穿杨技惊四座！"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/77833dccae7a716b65c99f4dd122eef7a6082b05ae2e232c51bd39b316e7ae36.png"
}
