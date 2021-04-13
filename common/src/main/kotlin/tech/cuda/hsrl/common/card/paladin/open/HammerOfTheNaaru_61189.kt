package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HammerOfTheNaaru_61189 : Card() {
    override val id = 61189
    override val name = "纳鲁之锤"
    override val description = "<b>战吼：</b>召唤一个6/6并具有<b>嘲讽</b>的神圣元素。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "其实纳鲁不会使用武器。况且纳鲁也没有手。"
    override val artist = "SARIYA"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/76a57fcf0e603f658e4c6b0428b4d539fb3eb53379a52034fa1a6b32a2446e05.png"
}
