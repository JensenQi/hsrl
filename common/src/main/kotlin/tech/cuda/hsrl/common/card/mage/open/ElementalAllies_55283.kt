package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElementalAllies_55283 : Card() {
    override val id = 55283
    override val name = "元素盟军"
    override val description = "<b>支线任务：</b> 连续两个回合使用元素牌。<b>奖励：</b>从你的牌库中抽三张法术牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "幸好接住雷诺的不是火元素。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a835c63ff082ef53f46286c09e8ec1b828a9368c4fdac363a2d8057acc54781b.png"
}
