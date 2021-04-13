package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldOfHonor_59409 : Card() {
    override val id = 59409
    override val name = "荣誉护盾"
    override val description = "使一个受伤的随从获得+3攻击力和<b>圣盾</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“老师，这个盾在上回合更有用啊！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4dbf49cfd40a528e12ab2f08cbdb4028ab73dce226a37fed63c7e966a25c0c21.png"
}
