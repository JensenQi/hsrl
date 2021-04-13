package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EadricThePure_2727 : Card() {
    override val id = 2727
    override val name = "纯洁者耶德瑞克"
    override val description = "<b>战吼：</b>使所有敌方随从的攻击力变为1。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "没人能像耶德瑞克那样轻松驾驭单片眼镜。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e0939c47381c67b95190a43260ebe1aa64134912177474e9e6d6c328410790ad.png"
}
