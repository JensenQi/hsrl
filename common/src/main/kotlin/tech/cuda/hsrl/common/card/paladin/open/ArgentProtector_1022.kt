package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentProtector_1022 : Card() {
    override val id = 1022
    override val name = "银色保卫者"
    override val description = "<b>战吼：</b>使一个其他友方随从获得<b>圣盾</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "“我没说你能够躲过火球。我是说有了这盾，你就不需要躲了。”"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/50c585cf0e2dcfc01714d2736e2be7e07d8dfd742bb88c096be035c1cb98bd49.png"
}
