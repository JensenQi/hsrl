package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Safeguard_52288 : Card() {
    override val id = 52288
    override val name = "机械保险箱"
    override val description = "<b>嘲讽，亡语：</b>召唤一个0/5并具有<b>嘲讽</b>的保险柜。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "注意保密，注意保险！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b2f470726c1a9fd2f4d48bcac208ff5b16f295d43b7dcaab7322ea00fe2ac49.png"
}
