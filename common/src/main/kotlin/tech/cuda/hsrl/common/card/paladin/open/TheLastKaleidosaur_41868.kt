package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheLastKaleidosaur_41868 : Card() {
    override val id = 41868
    override val name = "最后的水晶龙"
    override val description = "<b>任务：</b>对你的随从施放6个法术。 <b>奖励：</b>嘉沃顿。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "“不！这不可能！”白银之手新兵的眼神里充满了恐惧。乌瑟尔摇了摇头，用圣光将水晶点亮：“生命总能自己找到出路。”"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/559d6cc8aa33071bb3b2292fb1cf3cbe32e0da5dd6a4256d573da10242cddfdd.png"
}
