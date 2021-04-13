package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelscreamBlast_61127 : Card() {
    override val id = 61127
    override val name = "邪吼冲击"
    override val description = "<b>吸血</b> 对一个随从和相邻的随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "邪吼撞过来的时候，所有灵魂都会高喊：“磕到了！磕死我了！”"
    override val artist = "K. Lashley & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d529bd112a220fe33df97e36f5b163d6a1af9948667582a4d07ab416f291f217.png"
}
