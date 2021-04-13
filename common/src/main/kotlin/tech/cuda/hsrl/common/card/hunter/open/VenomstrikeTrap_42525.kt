package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VenomstrikeTrap_42525 : Card() {
    override val id = 42525
    override val name = "眼镜蛇陷阱"
    override val description = "<b>奥秘：</b>当你的随从受到攻击时，召唤一条2/3并具有<b>剧毒</b>的眼镜蛇。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "注意，有蛇出没。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5588a883717e085db58dfb401840eb5b294c0cc6aaabd362ac1e1e025c5fc615.png"
}
