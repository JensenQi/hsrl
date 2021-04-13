package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreadRaven_55446 : Card() {
    override val id = 55446
    override val name = "恐惧渡鸦"
    override val description = "你每控制一只其他恐惧渡鸦，便获得+3攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "趣味小知识：三只恐惧渡鸦表示凶恶之兆。而四只就够斩杀了！"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d6abc660b2c418603e6fb18dd8afff0fbda8a230a942f132504c7a89b3d73c2.png"
}
