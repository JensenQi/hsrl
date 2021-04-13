package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TortollanPilgrim_53771 : Card() {
    override val id = 53771
    override val name = "始祖龟朝圣者"
    override val description = "<b>战吼：</b>从你的牌库中 <b>发现</b>一张法术牌，并对随机目标施放。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "一只海龟成功入……沙漠！"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec96b7850a3d0f3358af52aba3cd57129c8edec0617d4cbe51cbb008ad2ba3e4.png"
}
