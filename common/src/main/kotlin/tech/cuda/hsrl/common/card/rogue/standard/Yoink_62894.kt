package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Yoink_62894 : Card() {
    override val id = 62894
    override val name = "偷师学艺"
    override val description = "<b>发现</b>一个英雄技能，并使其法力值消耗变为（0）点。使用两次后换回。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "出来偷，总是要还的。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/184b0601247921d2424e51e69ac6f3da7f8fcda68c7102d02c96b620bb9c961c.png"
}
