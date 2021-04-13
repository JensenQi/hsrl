package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CracklingRazormaw_41358 : Card() {
    override val id = 41358
    override val name = "雷鸣刺喉龙"
    override val description = "<b>战吼：</b><b>进化</b>一个友方野兽。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "还不够聪明，都不会绕过通电的防护栏。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8de9901a70dcd0332c2592254f5424ee6e219d476919e7b4f60a133735e1291f.png"
}
