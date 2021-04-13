package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bamboozle_57145 : Card() {
    override val id = 57145
    override val name = "偷天换日"
    override val description = "<b>奥秘：</b>当你的随从受到攻击时，随机将其变形成为一个法力值消耗增加（3）点的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“这次换我们骗你了，愚蠢的人类！”"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9422c98747a510455d687c2e83118ccc7bc3c1c5abef1575a93b8011a3c118c9.png"
}
