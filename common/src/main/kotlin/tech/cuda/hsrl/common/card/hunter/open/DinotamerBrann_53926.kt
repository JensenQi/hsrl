package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DinotamerBrann_53926 : Card() {
    override val id = 53926
    override val name = "恐龙大师布莱恩"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则召唤暴龙王克鲁什。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "布莱恩的恐龙训练计划进展顺利——他现在已经学会坐下，起立，还有打滚啦！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b1a702f9b47a2806ade1a5b6bff4b0c8f7fdacac409c47d8ed6e82eb1e95c252.png"
}
