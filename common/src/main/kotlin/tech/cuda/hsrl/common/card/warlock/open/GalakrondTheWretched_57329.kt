package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GalakrondTheWretched_57329 : Card() {
    override val id = 57329
    override val name = "邪火巨龙迦拉克隆"
    override val description = "<b>战吼：</b>随机召唤一个恶魔。<i>（ ）</i>"
    override var cost: Int? = 7
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "邪能火焰在骷髅周围盘旋，巨大的骸骨聚合成了恶魔般的怪物。重重绷带阻绝了热浪，却挡不住拉法姆脸上的笑意。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01bb7feabd8edaaf910e7690c33f3490df8c6b64539536fa3f701a7ab6334f57.png"
}
