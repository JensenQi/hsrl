package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EtcGodOfMetal_61262 : Card() {
    override val id = 61262
    override val name = "精英牛头人酋长，金属之神"
    override val description = "在一个友方<b>突袭</b>随从攻击后，对敌方英雄造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "先是上古之神，现在又来了个摇滚之神。"
    override val artist = "L. Lullabi & A. Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/96beb02a01926783888d1cf3a3eed6b33ead3a07b2949dec7299dcaedd707cb6.png"
}
