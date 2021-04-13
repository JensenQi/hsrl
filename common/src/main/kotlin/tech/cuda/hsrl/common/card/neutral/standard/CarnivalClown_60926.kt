package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarnivalClown_60926 : Card() {
    override val id = 60926
    override val name = "狂欢小丑"
    override val description = "<b>嘲讽，战吼：</b>召唤该随从的两个复制。<b>腐蚀：</b>召唤该随从的复制，直到你的随从数量达到上限。"
    override var cost: Int? = 9
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "关门，放小丑！"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/088791988c4fbaa1f3e40d37618425b12661295ceebddbf45053bacd564c115f.png"
}
