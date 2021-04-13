package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwinetuskShank_62893 : Card() {
    override val id = 62893
    override val name = "猪牙匕首"
    override val description = "在你使用一张药膏牌后，获得+1 耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "买猪牙，送猪排！"
    override val artist = "Kagi "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/547246abfa9d49cbc1d3cdc513b1d594b1b96367beaed6bdf224ca011da71e2e.png"
}
