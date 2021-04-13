package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RuneDagger_58790 : Card() {
    override val id = 58790
    override val name = "符文匕首"
    override val description = "在你的英雄攻击后，在本回合中获得<b>法术伤害+1</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "实验表明，被戳中之后会让人更容易受到法术伤害。"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1140b4a98bee5dc89679592b0dc07cd529eb0657b8320ad94cafe7c9689afec2.png"
}
