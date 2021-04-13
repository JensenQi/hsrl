package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OverlordsWhip_50595 : Card() {
    override val id = 50595
    override val name = "领主之鞭"
    override val description = "在你使用一张随从牌后，对其造成1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“这些徽章来之不易。这个是挨鞭子拿到的，这个是挨针扎拿到的……”"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/199fe641fd2e41ff8454487a3ba180bbbe009a4df9164048910951cd09c43cc4.png"
}
