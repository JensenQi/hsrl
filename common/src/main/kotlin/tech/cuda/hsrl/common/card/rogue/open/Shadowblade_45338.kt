package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowblade_45338 : Card() {
    override val id = 45338
    override val name = "暗影之刃"
    override val description = "<b>战吼：</b>在本回合中，你的英雄获得<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "叫“暗影匕首”就有点俗气了。"
    override val artist = "Matthew O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0085c792ce013afc8da340a502d0cc77c9912947b207bc01cfb7de11f2e47571.png"
}
