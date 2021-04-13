package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BolaShot_61965 : Card() {
    override val id = 61965
    override val name = "套索射击"
    override val description = "对一个随从造成 1点伤害，并对其相邻的随从造成 2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "回头想想，用套索打飞虫好像也不是很合适。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e1f016b652caa86d7a74097f5267da624c1861afe2f2ec448a35006d45f424a8.png"
}
