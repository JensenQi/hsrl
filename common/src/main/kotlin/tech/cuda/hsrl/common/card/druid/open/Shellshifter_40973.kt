package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shellshifter_40973 : Card() {
    override val id = 40973
    override val name = "变形神龟"
    override val description = "<b>抉择：</b>将该随从变形成为5/3并具有<b>潜行</b>；或者将该随从变形成为3/5并具有<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "他是玩三壳游戏的高手，你永远也猜不中球在哪个壳下面。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ed9a4eca83215bac6342c813ea961b6971bf0016d7402734ef3ab7721d98e9a4.png"
}
