package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheScythe_46859 : Card() {
    override val id = 46859
    override val name = "镰刀德鲁伊"
    override val description = "<b>抉择：</b>将该随从变形成为4/2并具有<b>突袭</b>；或者将该随从变形成为2/4并具有<b>嘲讽</b>。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "你猜变身后镰刀去哪了？"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c992fc8560bfee45ef24efc28ee2a6333cf33dd4c8a00b06647b0ed989e95da7.png"
}
