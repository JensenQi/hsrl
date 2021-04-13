package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedCelestial_61948 : Card() {
    override val id = 61948
    override val name = "被禁锢的星骓"
    override val description = "<b>休眠</b>两回合。<b>法术迸发：</b>使你的随从获得<b>圣盾</b>。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "此马非凡马，星骓本是星。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63c2a2a94dc9fa0a4c98dd66a87c0d8dc698fb1b322ff0be1b5fe2c827b3db63.png"
}
