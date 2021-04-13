package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hysteria_61944 : Card() {
    override val id = 61944
    override val name = "狂乱"
    override val description = "选择一个敌方随从，使其随机攻击随从，直至死亡。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我和我的座驾有着特别的羁绊，只不过算不上美好。”"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/91dc758f92bf493ea97857b0bd9a8d1782b3cb93181239a118d3297555c50a31.png"
}
