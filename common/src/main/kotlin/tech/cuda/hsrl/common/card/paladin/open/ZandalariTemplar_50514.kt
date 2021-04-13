package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZandalariTemplar_50514 : Card() {
    override val id = 50514
    override val name = "赞达拉武士"
    override val description = "<b>战吼：</b>在本局对战中，如果你累计恢复了10点生命值，则获得+4/+4和<b>嘲讽</b>。 <i>（还需恢复 点！）</i> <i>（已经就绪！）</i>"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "你曾是一位圣殿骑士啊，琼达！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/58c78b5d545edc49fde4a9394753cec3152f2ea794f3d9aea0830699cc09efa2.png"
}
