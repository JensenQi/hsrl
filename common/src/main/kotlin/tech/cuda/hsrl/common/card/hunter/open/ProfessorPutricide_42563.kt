package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ProfessorPutricide_42563 : Card() {
    override val id = 42563
    override val name = "普崔塞德教授"
    override val description = "在你使用一个<b>奥秘</b>后，随机将一个猎人的<b>奥秘</b>置入战场。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "他最得意的发明有：长有触手的侍从、能消灭艾泽拉斯所有生命的瘟疫和指尖陀螺。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/95713bb676e17a4a7aefbe0068f16d9cc2e28bbe3f81da5333fa139b824b1fe8.png"
}
