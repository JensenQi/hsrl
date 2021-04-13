package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HighAbbessAlura_59587 : Card() {
    override val id = 59587
    override val name = "高阶修士奥露拉"
    override val description = "<b>法术迸发：</b>从你的牌库中施放一张法术牌<i>（尽可能以该随从为目标）</i>。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "法术书对她来说很有吸引力。字面意义的吸引力。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/17cf09202cb63cccdd23d0ef800845ff1237583dcbe71f8c42990965a87a0205.png"
}
