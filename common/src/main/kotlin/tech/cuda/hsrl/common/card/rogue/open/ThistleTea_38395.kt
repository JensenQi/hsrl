package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThistleTea_38395 : Card() {
    override val id = 38395
    override val name = "菊花茶"
    override val description = "抽一张牌。将两张该牌的复制置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "“喝了菊花茶，腰不酸腿不痛，连击起来更带劲” - 潜行者协会指定饮品。"
    override val artist = "Matthew O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f20126e329445298bddff3dddf4839354a2fa14610286001050f94536fc983f.png"
}
