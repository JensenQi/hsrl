package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FacelessCorruptor_55426 : Card() {
    override val id = 55426
    override val name = "无面腐蚀者"
    override val description = "<b>突袭，战吼：</b>将你的一个随从变形成为该随从的复制。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "拉祖尔女士和脸有什么仇什么怨？！"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9743adc9401c7da339fd39c4c5ad88f2ed80f19d74d90e60ce99cf2743648139.png"
}
