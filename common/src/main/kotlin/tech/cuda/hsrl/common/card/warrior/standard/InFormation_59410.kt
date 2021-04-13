package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InFormation_59410 : Card() {
    override val id = 59410
    override val name = "保持阵型"
    override val description = "随机将两张<b>嘲讽</b>随从牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“这次为什么只考了十分？”“两块盾丢了一块……”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6ed82ceebe1bec8cf39513fd10f0c1d721781dd8b4390743fd6519a2b3b0160.png"
}
