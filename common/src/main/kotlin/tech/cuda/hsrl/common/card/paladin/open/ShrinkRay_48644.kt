package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShrinkRay_48644 : Card() {
    override val id = 48644
    override val name = "萎缩射线"
    override val description = "将所有随从的攻击力和生命值 变为1。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "其实它的运作原理就是放大你的世界。"
    override val artist = "Jiajun Tian"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/03523e951339afacf385efd67e83087e5bf0c4461e8d69f3c9487a8778ac4470.png"
}
