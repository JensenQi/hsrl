package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheCavernsBelow_41222 : Card() {
    override val id = 41222
    override val name = "探索地下洞穴"
    override val description = "<b>任务：</b>使用四张名称相同的随从牌。 <b>奖励：</b>水晶核心。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "其实洞穴就在旅店的下面。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/329425fbd4e4f0d759e3e0a1f950df293bd951f1f72ab9c3da5777e889e11ba1.png"
}
