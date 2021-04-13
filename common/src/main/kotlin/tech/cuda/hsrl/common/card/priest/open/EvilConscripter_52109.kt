package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilConscripter_52109 : Card() {
    override val id = 52109
    override val name = "怪盗征募员"
    override val description = "<b>亡语：</b>将一张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "狗头人！当你遇到困难——狗头人！当你蜡烛用完——就请来加入，怪！盗！军！团！"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a49b76ed38bfc30b22a92204f2a99392ea7b614ca93f9dbd87831068c194a73.png"
}
