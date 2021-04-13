package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sindragosa_43506 : Card() {
    override val id = 43506
    override val name = "辛达苟萨"
    override val description = "<b>战吼：</b>召唤两个0/1的被冰封的勇士。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "“我认可你的努力，但我觉得你的魔法还有提升的空间。”——辛达苟萨在上完“如何给出建设性反馈”的课程后说道。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/182354d3faf254f07f74a08c23c9e13e4a3b4f71a6227acbdadb093722d025bb.png"
}
