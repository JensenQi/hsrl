package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PotionOfIllusion_59621 : Card() {
    override val id = 59621
    override val name = "幻觉药水"
    override val description = "将你的所有随从的1/1的复制置入你的手牌，并使其法力值消耗变为（1）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "悲剧的是，目前还没有能消除这些幻觉怪脸的药剂。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/752a81467dad550f0ed5539187dd642a959f2f22f2621156e9b171c767779d96.png"
}
