package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PotionOfHeroism_43373 : Card() {
    override val id = 43373
    override val name = "英勇药水"
    override val description = "使一个随从获得<b>圣盾</b>。抽 一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "只要喝上三碗，老虎又算什么。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/716680db7d39a29df88cb45d74fbc5f9cd3ac156966cd4b12a54d06d6c46f282.png"
}
