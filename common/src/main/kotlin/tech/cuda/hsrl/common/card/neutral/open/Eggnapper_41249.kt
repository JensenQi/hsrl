package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Eggnapper_41249 : Card() {
    override val id = 41249
    override val name = "卑劣的窃蛋者"
    override val description = "<b>亡语：</b>召唤两个1/1的迅猛龙。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "说出来怕你不信，他偷蛋只为拿来当枕头用。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb1c723445116a9f32b7b91161fd94e8432bbe8589c951a8603555747abbee14.png"
}
