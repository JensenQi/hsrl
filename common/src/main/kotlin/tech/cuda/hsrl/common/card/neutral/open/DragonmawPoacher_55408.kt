package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonmawPoacher_55408 : Card() {
    override val id = 55408
    override val name = "龙喉偷猎者"
    override val description = "<b>战吼：</b>如果你的对手控制着一条龙，便获得+4/+4和<b>突袭</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“妈妈，我长角了！” “……” “妈妈，你不为我高兴吗？”"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b007a1ce89a21901e3a36a6c328ea23b825e010aa2bc1aa6437e46d48184aee.png"
}
