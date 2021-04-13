package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Backstab_68348 : Card() {
    override val id = 68348
    override val name = "背刺"
    override val description = "对一个未受伤的随从造成 2点 伤害。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "大叫着“看那儿！”，然后让你的对手背对着你，这一招总是出奇地有效。"
    override val artist = "Michael Sutfin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2339024206b8156a5188db71d6b6c61354dcb7f02af5517c270fe0679c61b785.png"
}
