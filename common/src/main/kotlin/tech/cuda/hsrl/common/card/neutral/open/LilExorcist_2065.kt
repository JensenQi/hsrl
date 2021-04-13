package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LilExorcist_2065 : Card() {
    override val id = 2065
    override val name = "小个子驱魔者"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>每有一个具有<b>亡语</b>的敌方随从，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "术士们让城里的驱魔者都开通了驱魔热线，防止在他们召唤出错误的恶魔的时候酿成惨剧。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ed111a37e5c5e2b302f68e6a9affa8173c344af1b1c23f4bc927fa8bbf22b77e.png"
}
