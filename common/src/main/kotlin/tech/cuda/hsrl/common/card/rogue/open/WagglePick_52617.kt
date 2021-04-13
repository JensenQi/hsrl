package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WagglePick_52617 : Card() {
    override val id = 52617
    override val name = "摇摆矿锄"
    override val description = "<b>亡语：</b>随机将一个友方随从移回你的手牌。它的法力值消耗减少（2）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "体验狗头人的死亡之舞！"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbdca0e9d26eec464ade04f2913e86851d5b8d3bc3555aece233c0bac178653b.png"
}
