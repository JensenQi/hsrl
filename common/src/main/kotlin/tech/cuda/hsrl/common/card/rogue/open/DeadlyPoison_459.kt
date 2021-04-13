package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadlyPoison_459 : Card() {
    override val id = 459
    override val name = "致命药膏"
    override val description = "使你的武器获得+2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "潜行者们都小心翼翼地保守着制毒的秘密，唯恐法师们把毒药用在他们的法术之中。毒性箭？剧毒之雨？毒元素？听上去就很可怕。"
    override val artist = "Trevor Jacobs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0887d2fb59a8b3d48bbc66a6e718af42cd4d97d8527ff2dde788cd5c56363eff.png"
}
