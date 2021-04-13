package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlikSkyshiv_55105 : Card() {
    override val id = 55105
    override val name = "菲里克·飞刺"
    override val description = "<b>战吼：</b>消灭一个随从及其所有的复制<i>（无论它们在哪）</i>。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "初级探险者搜寻着夜空，生怕看见她头顶的烛火！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84bdb09fe730c36f664771d3052b21cd6b71fc0838bf50a9b989bf29f6628020.png"
}
