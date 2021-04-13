package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MalfurionThePestilent_43417 : Card() {
    override val id = 43417
    override val name = "污染者玛法里奥"
    override val description = "<b>抉择：</b>召唤两只具有<b>剧毒</b>的蜘蛛；或者召唤两只具有<b>嘲讽</b>的甲虫。"
    override var cost: Int? = 7
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "“塞纳留斯曾经教导我，生死之间的平衡极其宝贵。我现在明白了：根本没有平衡。死亡永远不败。”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/832ebbacf3f94f53bda7d8d532a692209536a251e53d80c905ddece8373729dc.png"
}
