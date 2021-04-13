package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Malkorok_38739 : Card() {
    override val id = 38739
    override val name = "马尔考罗克"
    override val description = "<b>战吼：</b>随机装备一把武器。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "马尔考罗克是加尔鲁什最好的兄弟！真的，不信你去查查。"
    override val artist = "E. Guiton & Nutchapol "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4eb531600cad2f5737a0b94b16dd75073e69d3bd7b712b097e4006ad6b067f63.png"
}
