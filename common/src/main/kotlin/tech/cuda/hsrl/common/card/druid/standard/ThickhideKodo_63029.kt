package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThickhideKodo_63029 : Card() {
    override val id = 63029
    override val name = "厚皮科多兽"
    override val description = "<b>嘲讽</b>，<b>亡语：</b>获得5点护甲值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "专业技能推出之后，科多兽的种群数量遭到了毁灭性打击。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a95e162e53f6211516eba4f1655b366f183f8a0777022998d25e95a2c751e01.png"
}
